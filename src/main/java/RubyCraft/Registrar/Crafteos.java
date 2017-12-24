package RubyCraft.Registrar;

import RubyCraft.Bases.Crafteos_Bases;
import RubyCraft.Gui.Manager.MesaRubyManager;
import RubyCraft.Iniciar.Armaduras;
import RubyCraft.Iniciar.Bloques;
import RubyCraft.Iniciar.Herramientas;
import RubyCraft.Iniciar.RItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos {

	public static void IniciarTodo(){
		
		Crafteos_Normal();
		Iniciar_Crafteos_Mesa_de_Ruby();
		Iniciar_Crafteos_Mesa_Zafiro();
		
	}
	
	public static void Crafteos_Normal(){
		//Crafteos que no tiene que ver con el Mod
		GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[]{"bbb","bmb","bbb",'b',Blocks.GOLD_BLOCK,'m',Items.APPLE});
		GameRegistry.addRecipe(new ItemStack(Items.NETHER_STAR), new Object[]{"ccc","aaa","eaf",'c',new ItemStack(Items.SKULL,1,1),'a',Blocks.SOUL_SAND,'e',Items.DIAMOND_SWORD,'f',Items.BOW});
		//Con Forma
		GameRegistry.addRecipe(new ItemStack(Bloques.mesa_de_ruby, 1), new Object[]{"brb","rmr","brb",'b',Bloques.bloque_de_ruby,'r',RItems.ruby,'m',Blocks.CRAFTING_TABLE});    	

        GameRegistry.addRecipe(new ItemStack(Bloques.Ladrillo_de_obsidiana, 4), new Object[]{"oo","oo",'o',Blocks.OBSIDIAN});		
	    GameRegistry.addRecipe(new ItemStack(RItems.amuleto, 1),new Object[]{" m ", "mcm", " m ", 'm', RItems.Marcodelamuleto, 'c', RItems.colores});
	    GameRegistry.addRecipe(new ItemStack(RItems.Marcodelamuleto, 1), new Object[]{" b ","blb"," b ",'b', Blocks.GOLD_BLOCK, 'l', Items.GOLD_INGOT});
	    GameRegistry.addRecipe(new ItemStack(RItems.colores, 1), new Object[]{" l ","rdi"," u ",'d', Items.DYE, 'r', Items.REDSTONE, 'i', Items.IRON_INGOT, 'u', RItems.uranio, 'l', Items.WATER_BUCKET});
	    GameRegistry.addRecipe(new ItemStack(Bloques.Bloqueluminiscente, 1), new Object[]{" u ","upu"," u ",'u', RItems.uranio, 'p', Items.GLOWSTONE_DUST});
    	GameRegistry.addRecipe(new ItemStack(Bloques.Bloque_de_Diamante_Trol, 1), new Object[]{"edr","dld","rde",'e', Items.ENDER_PEARL,'d',Items.DIAMOND,'r',Items.REDSTONE,'l',Items.LAVA_BUCKET});
	    GameRegistry.addRecipe(new ItemStack(Bloques.Bloque_de_uranio, 1),new Object[]{"uuu", "uuu", "uuu", 'u', RItems.uranio});
    	GameRegistry.addRecipe(new ItemStack(RItems.uranio, 2), new Object[]{"sr","rh", 's', Items.SLIME_BALL, 'r', RItems.ruby, 'h', Items.IRON_INGOT});
	    GameRegistry.addRecipe(new ItemStack(RItems.anillo, 1), new Object[]{" d ","o o"," o ",'d', Items.DIAMOND,'o', Items.GOLD_INGOT});
    	GameRegistry.addRecipe(new ItemStack(RItems.ruby, 1), new Object[]{"ppp","ppp","ppp",'p',RItems.Pepita_de_Ruby});	    
	    GameRegistry.addRecipe(new ItemStack(RItems.zafiro, 1), new Object[]{"ppp","ppp","ppp",'p',RItems.Pepita_de_Zafiro});
    	GameRegistry.addRecipe(new ItemStack(Bloques.BloquedeEnderPearld, 1), new Object[]{"eee","eee","eee",'e',Items.ENDER_PEARL});
	    GameRegistry.addRecipe(new ItemStack(RItems.ruby, 3), new Object[]{"rhr","hoh","rhr",'r',Items.REDSTONE,'h',Items.IRON_INGOT,'o',Items.GOLD_INGOT});
    	GameRegistry.addRecipe(new ItemStack(RItems.zafiro, 3), new Object[]{"rlr","ldl","rlr",'r',RItems.ruby,'l',new ItemStack(Items.DYE, 1, 4),'d',Items.DIAMOND});
	    GameRegistry.addRecipe(new ItemStack(Bloques.ladrillo_de_granito, 4), new Object[]{"gg","gg",'g',new ItemStack(Blocks.STONE, 1, 2)});
    	GameRegistry.addRecipe(new ItemStack(Bloques.ladrillo_de_andesita, 4), new Object[]{"aa","aa",'a',new ItemStack(Blocks.STONE, 1, 6)});
    	GameRegistry.addRecipe(new ItemStack(Bloques.ladrillo_de_diorita, 4), new Object[]{"aa","aa",'a',new ItemStack(Blocks.STONE, 1, 4)});
	    GameRegistry.addRecipe(new ItemStack(Bloques.ladrillo_de_infiedra, 4), new Object[]{"ii","ii",'i',Blocks.NETHERRACK});
	    GameRegistry.addRecipe(new ItemStack(RItems.palo_verde, 4), new Object[]{"v","v",'v',Bloques.Madera_Verde});
    	GameRegistry.addRecipe(new ItemStack(Bloques.obsidiana_que_llora, 1), new Object[]{" l ","lol"," l ",'l',new ItemStack(Items.DYE, 1, 4), 'o',Blocks.OBSIDIAN});
	    GameRegistry.addRecipe(new ItemStack(RItems.pan_de_calabaza, 1), new Object[]{"tct",'c', Items.PUMPKIN_SEEDS, 't', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(Herramientas.arco_de_ruby, 1), new Object[]{" pr","p r"," pr", 'r', RItems.ruby, 'p', Items.STICK});
    	GameRegistry.addRecipe(new ItemStack(Herramientas.arco_de_zafiro, 1), new Object[]{" pr","p r"," pr", 'r', RItems.zafiro, 'p', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(Bloques.cristal_verde_lima, 4), new Object[]{"tct","ctc","tct",'t', new ItemStack(Items.DYE, 1, 10), 'c',Blocks.GLASS});
        GameRegistry.addRecipe(new ItemStack(Bloques.cristal_azul_claro, 4), new Object[]{"tct","ctc","tct",'t', new ItemStack(Items.DYE, 1, 12), 'c',Blocks.GLASS});
        GameRegistry.addRecipe(new ItemStack(Bloques.bloque_de_caca, 8), new Object[]{"ccc","ctc","ccc",'c',Items.ROTTEN_FLESH,'t',Blocks.DIRT});
        GameRegistry.addRecipe(new ItemStack(Bloques.generar_dragon, 1), new Object[]{"mrp","rzr","prm",'m',RItems.manzana_de_diamante,'r',RItems.Pepita_de_Ruby,'p',RItems.Pepita_de_Zafiro,'z',RItems.zafiro});
        GameRegistry.addRecipe(new ItemStack(RItems.varita, 1), new Object[]{" rr"," pr","p  ",'r',RItems.ruby,'p',Items.STICK});
        GameRegistry.addRecipe(new ItemStack(Bloques.bloque_reforzado_tier_1, 2), new Object[]{"pbz","bab","rbp",'p',Bloques.bloque_de_platino, 'b', Blocks.IRON_BARS, 'z', RItems.zafiro, 'a', RItems.barra_de_aluminio, 'r', RItems.ruby});
	    GameRegistry.addRecipe(new ItemStack(Bloques.bloque_de_actualizaciones, 1), new Object[]{"oro","dcd","oro",'o', Items.GOLD_INGOT,'r',Items.REDSTONE,'d',Items.DIAMOND,'c',Items.COMPARATOR});	
        GameRegistry.addRecipe(new ItemStack(Armaduras.elitros, 1), new Object[] {"ooo","oeo","ooo",'o',Items.GOLD_INGOT,'e',Items.ELYTRA});
        
    	Crafteos_Bases.Bloques(RItems.ruby, Bloques.bloque_de_ruby);
    	Crafteos_Bases.Bloques(RItems.zafiro, Bloques.Bloque_de_Zafiro);
    	Crafteos_Bases.Bloques(Items.FLINT, Bloques.bloque_de_pedernal);
    	Crafteos_Bases.Bloques(Items.ENDER_EYE, Bloques.bloque_de_ojo_de_enderman);
    	Crafteos_Bases.Bloques(RItems.cobre, Bloques.bloque_de_cobre);
    	Crafteos_Bases.Bloques(RItems.lingote_galactico, Bloques.bloque_galactico);
        Crafteos_Bases.Bloques(RItems.platino, Bloques.bloque_de_platino);
    	
		//Sin Forma
    	
	    GameRegistry.addRecipe(new ItemStack(Items.FLINT, 9), new Object[]{"p",'p',Bloques.bloque_de_pedernal});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.BLAZE_ROD, 25), new Object[]{Bloques.bloque_de_blaze});
    	GameRegistry.addShapelessRecipe(new ItemStack(RItems.Pepita_de_Ruby, 9), new Object[]{RItems.ruby});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Ladrillo_Marino, 4), new Object[]{Blocks.BRICK_BLOCK,Blocks.BRICK_BLOCK,Items.WATER_BUCKET,Items.WATER_BUCKET});
        GameRegistry.addShapelessRecipe(new ItemStack(RItems.ruby, 9), new Object[]{Bloques.bloque_de_ruby});
        GameRegistry.addShapelessRecipe(new ItemStack(RItems.zafiro, 9), new Object[]{Bloques.Bloque_de_Zafiro});
        GameRegistry.addShapelessRecipe(new ItemStack(RItems.cobre, 9), new Object[]{Bloques.bloque_de_cobre});
        GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Ladrillo_del_Bosque, 4), new Object[]{Blocks.BRICK_BLOCK,Blocks.BRICK_BLOCK,Blocks.CACTUS,Blocks.CACTUS});        
        GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Tronco_Azul, 1), new Object[]{Blocks.LOG,Items.WATER_BUCKET});
	    GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Madera_Azul, 4), new Object[]{Bloques.Tronco_Azul});
	    GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Madera_Verde, 4), new Object[] {Bloques.Tronco_de_Madera_verde});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Tronco_de_Madera_verde, 1), new Object[] {Blocks.LOG,Blocks.CACTUS});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Bloque_de_Regeneracion, 4), new Object[]{Blocks.MAGMA,Items.GOLDEN_APPLE,Blocks.CACTUS,Blocks.CACTUS,Blocks.CACTUS});
	    GameRegistry.addShapelessRecipe(new ItemStack(RItems.BoladeResina, 9), new Object[]{Blocks.COAL_BLOCK,Items.GOLD_NUGGET});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Bloque_de_azucar, 1), new Object[]{Items.SUGAR,Items.SUGAR,Items.SUGAR,Items.SUGAR});
    	GameRegistry.addShapelessRecipe(new ItemStack(RItems.Pepita_de_Zafiro, 9), new Object[]{RItems.zafiro});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_PEARL, 9), new Object[]{Bloques.BloquedeEnderPearld});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_EYE, 9), new Object[]{Bloques.bloque_de_ojo_de_enderman});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Bloque_de_veneno, 4), new Object[]{Bloques.Bloque_de_Regeneracion,Bloques.Bloque_de_Regeneracion, Bloques.Bloque_de_Regeneracion, Bloques.Bloque_de_Regeneracion, Items.POISONOUS_POTATO});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Cuarzo_azul, 4), new Object[]{Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Items.WATER_BUCKET});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Cuarzo_verde, 4), new Object[]{Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.CACTUS});
    	GameRegistry.addShapelessRecipe(new ItemStack(Bloques.Cuarzo_rojo, 4), new Object[]{Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_BLOCK,Items.REDSTONE});
    	GameRegistry.addShapelessRecipe(new ItemStack(RItems.lingote_galactico, 9), new Object[]{Bloques.bloque_galactico});
        GameRegistry.addShapelessRecipe(new ItemStack(Bloques.calabaza_espectral, 2), new Object[]{Blocks.PUMPKIN, Blocks.PUMPKIN});
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PUMPKIN, 2), new Object[]{Bloques.calabaza_espectral ,Bloques.calabaza_espectral});
		GameRegistry.addShapelessRecipe(new ItemStack(RItems.platino,  9), new Object[]{Bloques.bloque_de_platino});
    	//Horno
	    
    	GameRegistry.addSmelting(RItems.BoladeResina, new ItemStack(RItems.Plastico, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_ruby, new ItemStack(RItems.ruby, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_zafiro, new ItemStack(RItems.zafiro, 1), 15.0F);
    	GameRegistry.addSmelting(Items.EGG, new ItemStack(RItems.huevo_frito, 1), 10.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_ruby_end, new ItemStack(RItems.ruby, 1), 20.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_zafiro_end, new ItemStack(RItems.zafiro, 1), 20.0F);
    	GameRegistry.addSmelting(Bloques.mena_de_platino, new ItemStack(RItems.platino, 1), 50.0F);
    	
    	//Herramientas o Armaduras
    	
    	
    	Crafteos_Bases.Herramientas(RItems.cobre, Items.STICK, Herramientas.pico_de_cobre, Herramientas.espada_de_cobre, Herramientas.hacha_de_cobre, Herramientas.pala_de_cobre, Herramientas.azada_de_cobre, Herramientas.tijera_de_cobre);
    	
    	
    	Crafteos_Bases.Armaduras(RItems.uranio, Armaduras.casco_de_uranio, Armaduras.pechera_de_uranio, Armaduras.pantacas_de_uranio, Armaduras.botas_de_uranio);
    	
    	
	}
	
	public static void Iniciar_Crafteos_Mesa_de_Ruby(){
		
         Registros.addRecipeRuby(new ItemStack(Bloques.mesa_de_zafiro_basica, 1), new Object[]{"zbbbz","bmmmb","bmdmb","bmmmb","zbbbz", 'z', RItems.zafiro, 'm', Blocks.CRAFTING_TABLE, 'd', Items.DIAMOND, 'b', Bloques.bloque_de_ruby});
		 Registros.addRecipeRuby(new ItemStack(Bloques.bloque_de_blaze, 1), new Object[]{"bbbbb","bbbbb","bbbbb","bbbbb","bbbbb",'b',Items.BLAZE_ROD});
         Registros.addRecipeRuby(new ItemStack(Bloques.cristal_verde_lima, 21), new Object[]{"vvvvv","vvtvv","vtvtv","vvtvv","vvvvv",'v',new ItemStack(Blocks.STAINED_GLASS,1,5),'t',new ItemStack(Items.DYE,1,2)});
         Registros.addRecipeRuby(new ItemStack(Bloques.cristal_azul_claro, 21), new Object[]{"aaaaa","aataa","atata","aataa","aaaaa",'a',new ItemStack(Blocks.STAINED_GLASS,1,3),'t',new ItemStack(Items.DYE,1,12)});
         Registros.addRecipeRuby(new ItemStack(Herramientas.Pico_de_ruby, 1), new Object[]{"rrrrr","  p  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.hacha_de_ruby, 1), new Object[]{" rr  "," rp  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.azada_de_ruby, 1), new Object[]{" rr  ","  p  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.pala_de_ruby, 1), new Object[]{"  r  ","  p  ","  p  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.espada_de_ruby, 1), new Object[]{"  r  ","  r  ","  r  ","  p  ","  p  ",'r',RItems.ruby,'p',Items.STICK});
         Registros.addRecipeRuby(new ItemStack(Herramientas.pico_de_zafiro , 1), new Object[]{"zzzzz","  p  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.hacha_de_zafiro, 1), new Object[]{" zz  "," zp  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.azada_de_zafiro, 1), new Object[]{" zz  ","  p  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.pala_de_zafiro, 1), new Object[]{"  z  ","  p  ","  p  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Herramientas.espada_de_zafiro, 1), new Object[]{"  z  ","  z  ","  z  ","  p  ","  p  ",'z',RItems.zafiro,'p',RItems.palo_verde});
         Registros.addRecipeRuby(new ItemStack(Armaduras.casco_de_ruby, 1), new Object[]{"rrrrr","r   r","r   r",'r',RItems.ruby});
         Registros.addRecipeRuby(new ItemStack(Armaduras.pechera_de_ruby, 1), new Object[]{"r   r","rrrrr","rrrrr","rrrrr","rrrrr",'r',RItems.ruby});
         Registros.addRecipeRuby(new ItemStack(Armaduras.grebas_de_ruby, 1), new Object[]{"rrrrr","r   r","r   r","r   r","r   r",'r',RItems.ruby});
         Registros.addRecipeRuby(new ItemStack(Armaduras.botas_de_ruby, 1), new Object[]{"r   r","r   r","rr rr",'r',RItems.ruby});
         
	}
  
	public static void Iniciar_Crafteos_Mesa_Zafiro(){
		
         Registros.addRecipeZafiro(new ItemStack(RItems.manzana_de_diamante, 1), new Object[]{"zodz","dmmo","ommd","zdoz",'z',RItems.zafiro,'o',Items.GOLDEN_APPLE,'d',Items.DIAMOND,'m',Items.APPLE});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.casco_de_zafiro ,1), new Object[]{"zzz","z z",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.pechera_de_zafiro ,1), new Object[]{"z z","zzz","zzz",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.grebas_de_zafiro ,1), new Object[]{"zzz","z z","z z",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Armaduras.botas_de_zafiro ,1), new Object[]{"z z","z z",'z',RItems.zafiro});
         Registros.addRecipeZafiro(new ItemStack(Bloques.mesa_de_conjuraciones, 1), new Object[]{"cppu","varv","vzav","uppc",'c',Bloques.bloque_de_caca,'p',RItems.Plastico,'v',RItems.varita,'a',RItems.anillo,'u',RItems.uranio,'z',RItems.zafiro,'r',RItems.ruby});
         Registros.addRecipeZafiro(new ItemStack(RItems.molde_para_cofres, 2), new Object[]{"hpph","phcp","pchp","hpph",'h',Items.IRON_INGOT,'p',RItems.Pepita_de_Ruby,'c',Blocks.CHEST});
	}
	
	public static void Crafteos_Version_Trol(){
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 4), new Object[]{"mm","mm",'m',Blocks.PLANKS});
		
	}
	
	public static void IniciarCrafteosDiadelosInocentes() {
		
	}
	
	public static void IniciarCrafteosHallowen() {
		
	}
	
	public static void IniciarCrafteosNavidad() {
		
	}
	
}
