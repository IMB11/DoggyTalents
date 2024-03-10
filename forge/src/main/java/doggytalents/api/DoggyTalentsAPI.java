package doggytalents.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import doggytalents.api.registry.Accessory;
import doggytalents.api.registry.AccessoryType;
import doggytalents.api.registry.Talent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.function.Supplier;

/**
 * @author ProPercivalalb
 */
public class DoggyTalentsAPI {

    public static Supplier<IForgeRegistry<Talent>> TALENTS;
    public static Supplier<IForgeRegistry<Accessory>> ACCESSORIES;
    public static Supplier<IForgeRegistry<AccessoryType>> ACCESSORY_TYPE;
    
    public static final Logger LOGGER = LogManager.getLogger("doggytalents");
}
