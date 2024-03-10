package doggytalents.doggytalents.fabric;

import doggytalents.doggytalents.DoggyTalents;
import net.fabricmc.api.ModInitializer;

public class DoggyTalentsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        DoggyTalents.init();
    }
}