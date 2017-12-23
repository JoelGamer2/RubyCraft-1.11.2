package RubyCraft.Maquinas;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import RubyCraft.Handles.GuiHandler;
import RubyCraft.Iniciar.Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;

public class mesa_de_ruby extends Block {

	public mesa_de_ruby() {
		super(Material.WOOD);
		
		setUnlocalizedName(Referencia.RubyCraftBloques.MESA_DE_RUBY.getUnlocalizedName());
		setRegistryName(Referencia.RubyCraftBloques.MESA_DE_RUBY.getRegistryName());
		
		setHardness(0.5F);
		setResistance(1.0F);
		setSoundType(SoundType.WOOD);
		
	}

	
	/**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
    if(!player.isSneaking()){
            player.openGui(RubyCraft.instance, Bloques.guiIDMesadeTrabajodeRuby, world, pos.getX(), pos.getY(), pos.getZ());
        }
	return true;
    }
	
}
