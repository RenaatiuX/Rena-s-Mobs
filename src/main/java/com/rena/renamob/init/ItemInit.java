package com.rena.renamob.init;

import com.rena.renamob.RenaMob;
import com.rena.renamob.objects.item.ModSpawnEggItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RenaMob.MODID);
	
	
	public static final RegistryObject<Item> RENA_TAB = ITEMS.register("rena_tab", 
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> PLUMA_ROJA = ITEMS.register("pluma_roja", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> FLAMA_ESPECIAL = ITEMS.register("flama_especial", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));

	public static final RegistryObject<Item> ESCAMA = ITEMS.register("escama", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> PICO = ITEMS.register("pico", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> TENAZAS = ITEMS.register("tenazas", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> PIEL_DURA = ITEMS.register("piel_dura", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> OJO = ITEMS.register("ojo", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> CUERNO = ITEMS.register("cuerno", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> COLMILLO_LOBO = ITEMS.register("colmillo_lobo", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> GARRA_LOBO = ITEMS.register("garra_lobo", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> COLMILLO_VAMPIRO = ITEMS.register("colmillo_vampiro", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> ALA = ITEMS.register("ala", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> CUERNO_RINO = ITEMS.register("cuerno_rino", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> COLMILLO_TIBURON = ITEMS.register("colmillo_tiburon", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> AGUIJON = ITEMS.register("aguijon", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> COLMILLO_CERBERUS = ITEMS.register("colmillo_cerberus", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> LINTERNA = ITEMS.register("linterna", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> MELENA_LEON = ITEMS.register("melena_leon", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> GARRA_LEON = ITEMS.register("garra_leon", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> PIEL_YETI = ITEMS.register("piel_yeti", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> ALETAS_HIPOCAMPO = ITEMS.register("aletas_hipocampo", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> ESCAMA_HIPOCAMPO = ITEMS.register("escama_hipocampo", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<Item> CUERNO_UNICORNIO = ITEMS.register("cuerno_unicornio", 
			() -> new Item(new Item.Properties().group(RenaMob.RENAITEM_GROUP)));
	
	public static final RegistryObject<ModSpawnEggItem> CALAMAR_AGRESIVO_EGG = ITEMS.register("calamar_agresivo_spawn_egg",
			() -> new ModSpawnEggItem(EntityInit.CALAMAR_AGRESIVO, 0xC8ED63, 0x13142316,
					new Item.Properties().group(RenaMob.RENAITEM_GROUP).maxStackSize(16)));
	
	public static final RegistryObject<ModSpawnEggItem> AMMYT_EGG = ITEMS.register("ammyt_spawn_egg",
			() -> new ModSpawnEggItem(EntityInit.AMMYT_ENTITY, 0xFF325F, 0x16777118,
					new Item.Properties().group(RenaMob.RENAITEM_GROUP).maxStackSize(16)));
	
}
