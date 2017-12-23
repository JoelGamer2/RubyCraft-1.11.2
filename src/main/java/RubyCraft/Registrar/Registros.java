package RubyCraft.Registrar;

import javax.annotation.Nonnull;

import RubyCraft.Gui.Manager.MesaRubyManager;
import RubyCraft.Gui.Manager.MesaZafiroManager;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class Registros {

	 //Mesa Ruby
    public static void addRecipeRuby(@Nonnull ItemStack output, Object... params)
    {
    	addShapedRecipeRuby(output, params);
    }

    public static IRecipe addShapedRecipeRuby(@Nonnull ItemStack output, Object... params)
    {
        return MesaRubyManager.getInstance().addRecipe(output, params);
    }

    public static void addShapelessRecipeRuby(@Nonnull ItemStack output, Object... params)
    {
    	MesaRubyManager.getInstance().addShapelessRecipe(output, params);
    }

    public static void addRecipeRuby(IRecipe recipe)
    {
    	MesaRubyManager.getInstance().getRecipeList().add(recipe);
    }
	
    //Mesa Zafiro
    public static void addRecipeZafiro(@Nonnull ItemStack output, Object... params)
    {
    	addShapedRecipeZafiro(output, params);
    }

    public static IRecipe addShapedRecipeZafiro(@Nonnull ItemStack output, Object... params)
    {
        return MesaZafiroManager.getInstance().addRecipe(output, params);
    }

    public static void addShapelessRecipeZafiro(@Nonnull ItemStack output, Object... params)
    {
    	MesaZafiroManager.getInstance().addShapelessRecipe(output, params);
    }

    public static void addRecipeZafiro(IRecipe recipe)
    {
    	MesaZafiroManager.getInstance().getRecipeList().add(recipe);
    }
    
}
