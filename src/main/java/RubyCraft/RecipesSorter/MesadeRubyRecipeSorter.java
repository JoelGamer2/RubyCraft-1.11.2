package RubyCraft.RecipesSorter;

import java.util.Comparator;

import RubyCraft.Gui.Manager.MesaRubyManager;
import net.minecraft.item.crafting.IRecipe;

public class MesadeRubyRecipeSorter implements Comparator{

	final MesaRubyManager MesadeTrabajodeRuby;
	public MesadeRubyRecipeSorter(MesaRubyManager mesarubiManager){
		this.MesadeTrabajodeRuby = mesarubiManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
		return irecipe1 instanceof MesadeRubyShapelessRecipes && irecipe2 instanceof MesaRubyShapedRecipes ? 1: (irecipe2 instanceof MesadeRubyShapelessRecipes && irecipe1 instanceof MesaRubyShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
			
		}
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
