package evilcraft.items;
import evilcraft.api.config.ExtendedConfig;
import evilcraft.api.config.ItemConfig;
import evilcraft.api.config.configurable.ConfigurableItem;

/**
 * A crushed dark gem, apparently the dark gem is purple on the inside!
 * @author rubensworks
 *
 */
public class DarkGemCrushed extends ConfigurableItem {
    
    private static DarkGemCrushed _instance = null;
    
    /**
     * Initialise the configurable.
     * @param eConfig The config.
     */
    public static void initInstance(ExtendedConfig<ItemConfig> eConfig) {
        if(_instance == null)
            _instance = new DarkGemCrushed(eConfig);
        else
            eConfig.showDoubleInitError();
    }
    
    /**
     * Get the unique instance.
     * @return The instance.
     */
    public static DarkGemCrushed getInstance() {
        return _instance;
    }

    private DarkGemCrushed(ExtendedConfig<ItemConfig> eConfig) {
        super(eConfig);
    }

}