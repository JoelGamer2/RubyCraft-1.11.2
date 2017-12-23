package RubyCraft.Bloques;

import java.util.Random;

import com.mojang.realmsclient.gui.ChatFormatting;

import RubyCraft.Referencia;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCompressedPowered;
import net.minecraft.block.BlockMagma;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.xml.Text;

public class Bloque_de_Diamante_Trol extends BlockCompressedPowered{

	 protected static final AxisAlignedBB Diamanate_trol_colision = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
	
	  public static DamageSource Troleo = new DamageSource("Troleo").setDamageAllowedInCreativeMode();

	  /**Cosas Modificables por Addons
	   Addons Can Modify**/
	public static int Coordenaday = 256;
	public static int Coordenadax = 0;
	public static int Coordenadaz = 0;
	public static DamageSource MensajedeMuerte = Troleo;
	public static int Experiencia = 10;
	public static float Dano = 20.0F;
	public static float Dano_Inocentes = 26.0F;
	
	/**Cosas no modificables por Addons
	   Addons can not Modify**/
	private final float  DanoTrol = 40.0F;
	private final float DanoNavidad = 0.5F;
	  
	public Bloque_de_Diamante_Trol() {
		super(Material.IRON,MapColor.BLUE);
		
       setUnlocalizedName(Referencia.RubyCraftBloques.BLOQUE_DE_DIAMANTE_TROL.getUnlocalizedName());
       setRegistryName(Referencia.RubyCraftBloques.BLOQUE_DE_DIAMANTE_TROL.getRegistryName());
       
       this.setHardness(50.0F);
       this.setHarvestLevel("pickaxe", 2);
		
	}	
	
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ){
	if(world.isRemote){	
		double x = pos.getX();
		double y = pos.getY() + 1;
		double z = pos.getZ();		
	    player.setPosition(player.posX + Coordenadax, player.posY + Coordenaday, player.posZ + Coordenadaz);
	    player.addExperience(Experiencia);
		player.sendMessage(new TextComponentTranslation(TextFormatting.GOLD + player.getName() + TextFormatting.RED + " Vas" + TextFormatting.BLUE + " a Morir " +  TextFormatting.GREEN + " xD "));
		
	   }
	   return true;
	}
	
	 public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
	        
	    }
	
	 public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return Diamanate_trol_colision;
	    }
	
	 /**
     * Called When an Entity Collided with the Block
     */
	    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entity){
    
    	if(RubyCraft.VersionTrol){
    		entity.attackEntityFrom(Troleo, DanoTrol);
    	}else if(!RubyCraft.VersionTrol)
        entity.attackEntityFrom(Troleo, Dano);
    }
	
	 /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower(IBlockState state)
    {
        return true;
    }

    public int getWeakPower(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return 15;
    }
	
	 public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon){
		    
		 return true;
		 
	    }
	
}