package main.java.themod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "themod")
@EventBusSubscriber
public class TheMod
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// logger = event.getModLog();
		// proxy.preInit(event);
		// s int test = 1 / 0;

	}

	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		// proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		// proxy.postInit(e);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		Block test = new Block(Material.CACTUS);
		test.setCreativeTab(CreativeTabs.COMBAT);
		test.setUnlocalizedName("test");
		test.setRegistryName("wat");
		event.getRegistry().registerAll(test);
		
	}
}
