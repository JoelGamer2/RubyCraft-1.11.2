package RubyCraft.RecipesSorter;

import java.util.Comparator;

import RubyCraft.Gui.Manager.MesaZafiroManager;
import net.minecraft.item.crafting.IRecipe;

public class MesadeZafiroRecipeSorter implements Comparator{

	final MesaZafiroManager MesadeTrabajodeZafiro;
	public MesadeZafiroRecipeSorter(MesaZafiroManager manager){
		this.MesadeTrabajodeZafiro = manager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
		return irecipe1 instanceof MesadeZafiroShapelessRecipes && irecipe2 instanceof MesaZafiroShapedRecipes ? 1: (irecipe2 instanceof MesadeZafiroShapelessRecipes && irecipe1 instanceof MesaZafiroShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
			
		}
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
