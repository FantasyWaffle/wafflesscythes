package wafflebender.wafflesscythes;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wafflebender.wafflesscythes.item.ModItems;

public class WafflesScythes implements ModInitializer {
	public static final String MODID = "wafflesscythes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}