package doggytalents;

import doggytalents.inventory.recipe.RecipeDogBed;
import doggytalents.inventory.recipe.RecipeDogCape;
import doggytalents.inventory.recipe.RecipeDogCollar;
import doggytalents.lib.BlockNames;
import doggytalents.lib.Reference;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModRecipes {
    
    public static final IRecipeSerializer<RecipeDogBed> DOG_BED = null;
    public static final IRecipeSerializer<RecipeDogCollar> COLLAR_COLOURING = null;
    public static final IRecipeSerializer<RecipeDogCape> CAPE_COLOURING = null;
    
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration {

        @SubscribeEvent
        public static void registerSoundEvents(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
            IForgeRegistry<IRecipeSerializer<?>> recipeRegistry = event.getRegistry();
            
            DoggyTalentsMod.LOGGER.debug("Registering Recipes");
            recipeRegistry.register(new SpecialRecipeSerializer<>(RecipeDogBed::new).setRegistryName(BlockNames.DOG_BED));
            recipeRegistry.register(new SpecialRecipeSerializer<>(RecipeDogCollar::new).setRegistryName(Reference.MOD_ID, "collar_colouring"));
            recipeRegistry.register(new SpecialRecipeSerializer<>(RecipeDogCape::new).setRegistryName(Reference.MOD_ID, "cape_colouring"));
            DoggyTalentsMod.LOGGER.debug("Finished Registering Recipes");
        }
    }
}

