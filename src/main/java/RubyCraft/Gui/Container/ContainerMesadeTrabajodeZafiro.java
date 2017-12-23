package RubyCraft.Gui.Container;

import RubyCraft.Gui.Manager.MesaRubyManager;
import RubyCraft.Gui.Manager.MesaZafiroManager;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ContainerMesadeTrabajodeZafiro extends Container{

    /** The crafting matrix inventory (3x3). */
    public InventoryCrafting craftMatrix = new InventoryCrafting(this, 4, 4);
    public IInventory craftResult = new InventoryCraftResult();
    private final World world;
    /** Position of the workbench */
    private final BlockPos pos;

    public ContainerMesadeTrabajodeZafiro(InventoryPlayer invPlayer, World worldIn, BlockPos posIn) {
    	 this.world = worldIn;
         this.pos = posIn;
		this.addSlotToContainer(new SlotCrafting(invPlayer.player, craftMatrix, craftResult, 0, 125, 44));
		
		for (int i = 0; i < 4; i++) {
			for(int k = 0; k < 4; k++) {
				this.addSlotToContainer(new Slot(craftMatrix, k + i * 4, 12 + k * 18, 17 + i * 18));
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for(int k = 0; k < 9; k++) {
				this.addSlotToContainer(new Slot(invPlayer, k + i * 9 + 9, 8 + k * 18, 102 + i * 18));
			}
		}
		
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 160));
		}
		
		onCraftMatrixChanged(craftMatrix);
	}
    /**
     * Callback for when the crafting matrix is changed.
     */
    public void onCraftMatrixChanged(IInventory inventoryIn)
    {
        this.craftResult.setInventorySlotContents(0, MesaZafiroManager.getInstance().findMatchingRecipe(this.craftMatrix, this.world));
    }

    /**
     * Called when the container is closed.
     */
    public void onContainerClosed(EntityPlayer playerIn)
    {
        super.onContainerClosed(playerIn);

        if (!this.world.isRemote)
        {
            for (int i = 0; i < 25; ++i)
            {
                ItemStack itemstack = this.craftMatrix.removeStackFromSlot(i);

                if (!itemstack.isEmpty())
                {
                    playerIn.dropItem(itemstack, false);
                }
            }
        }
    }

    /**
     * Determines whether supplied player can use this container
     */
    public boolean canInteractWith(EntityPlayer playerIn)
    {
    	return true;
    }

    /**
     * Take a stack from the specified inventory slot.
     */
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 0)
            {
                itemstack1.getItem().onCreated(itemstack1, this.world, playerIn);

                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index >= 10 && index < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (index >= 37 && index < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            ItemStack itemstack2 = slot.onTake(playerIn, itemstack1);

            if (index == 0)
            {
                playerIn.dropItem(itemstack2, false);
            }
        }

        return itemstack;
    }

    /**
     * Called to determine if the current slot is valid for the stack merging (double-click) code. The stack passed in
     * is null for the initial slot that was double-clicked.
     */
    public boolean canMergeSlot(ItemStack stack, Slot slotIn)
    {
        return slotIn.inventory != this.craftResult && super.canMergeSlot(stack, slotIn);
    }
}