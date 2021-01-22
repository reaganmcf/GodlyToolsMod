/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class mod_goldytools
/*     */   extends BaseMod
/*     */ {
/*  12 */   public static final yr dbar = (new Itemdbar(2085)).a("dbar");
/*     */ 
/*     */   
/*  15 */   public static final yr dbsword = (new lx(2086, uk.DBAR)).a("dbsword");
/*     */ 
/*     */   
/*  18 */   public static final yr dbpickaxe = (new au(2087, uk.DBAR)).a("dbpickaxe");
/*     */ 
/*     */   
/*  21 */   public static final yr dbaxe = (new nx(2088, uk.DBAR)).a("dbaxe");
/*     */ 
/*     */   
/*  24 */   public static final yr dbshovel = (new akd(2089, uk.DBAR)).a("dbspade");
/*     */ 
/*     */   
/*  27 */   public static final yr dbhoe = (new ic(2090, uk.DBAR)).a("dbhoe");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   public static final yr goldrod = (new yr(2104)).a("goldrod");
/*     */ 
/*     */   
/*  37 */   public static final pb heavenlyore = (new Blockheavenlyore(151, 0)).c(6.0F).b(7.0F).a("heavnlyore");
/*     */ 
/*     */   
/*  40 */   public static final yr heavenlyessence = (new yr(2103)).a("heavenlyessence");
/*     */ 
/*     */   
/*  43 */   public static final yr heavenbar = (new Itemheavenbar(2091)).a("heavenbar");
/*     */ 
/*     */   
/*  46 */   public static final yr heavenlysword = (new lx(2092, uk.HEAVENBAR)).a("heavenlysword");
/*     */ 
/*     */   
/*  49 */   public static final yr heavenlypickaxe = (new au(2093, uk.HEAVENBAR)).a("heavenlypickaxe");
/*     */ 
/*     */   
/*  52 */   public static final yr heavenlyaxe = (new nx(2094, uk.HEAVENBAR)).a("heavenlyaxe");
/*     */ 
/*     */   
/*  55 */   public static final yr heavenlyshovel = (new akd(2095, uk.HEAVENBAR)).a("heavenlyshovel");
/*     */ 
/*     */   
/*  58 */   public static final yr heavenlyhoe = (new ic(2096, uk.HEAVENBAR)).a("heavenlyhoe");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   public static final yr hellishbar = (new Itemhellishbar(2097)).a("hellishbar");
/*     */ 
/*     */   
/*  68 */   public static final yr hellishsword = (new lx(2098, uk.HELLBAR)).a("hellishsword");
/*     */ 
/*     */   
/*  71 */   public static final yr hellishpickaxe = (new au(2099, uk.HELLBAR)).a("hellishpickaxe");
/*     */ 
/*     */   
/*  74 */   public static final yr hellishaxe = (new nx(2100, uk.HELLBAR)).a("hellishaxe");
/*     */ 
/*     */   
/*  77 */   public static final yr hellishshovel = (new akd(2101, uk.HELLBAR)).a("hellishshovel");
/*     */ 
/*     */   
/*  80 */   public static final yr hellishhoe = (new ic(2102, uk.HELLBAR)).a("hellishhoe");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void generateSurface(xd world, Random random, int chunkX, int chunkZ) {
/*  86 */     Random randomGenerator = random;
/*     */     
/*  88 */     for (int i = 0; i < 16; i++) {
/*     */       
/*  90 */       int randPosX = chunkX + randomGenerator.nextInt(10);
/*  91 */       int randPosY = random.nextInt(40);
/*  92 */       int randPosZ = chunkZ + randomGenerator.nextInt(10);
/*  93 */       (new eh(heavenlyore.bO, 1)).a(world, random, randPosX, randPosY, randPosZ);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load() {
/* 105 */     dbar.bS = ModLoader.addOverride("/gui/items.png", "/items/dbar.png");
/* 106 */     ModLoader.addName(dbar, "Death Bar");
/* 107 */     ModLoader.addRecipe(new aan(dbar, 1), new Object[] { "***", "###", "XXX", Character.valueOf('*'), pb.ap, Character.valueOf('#'), yr.bn, Character.valueOf('X'), yr.aX });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     dbsword.bS = ModLoader.addOverride("/gui/items.png", "/items/dbsword.png");
/* 115 */     ModLoader.addName(dbsword, "Death Bar Sword");
/* 116 */     ModLoader.addRecipe(new aan(dbsword, 1), new Object[] { " # ", " # ", " X ", Character.valueOf('#'), dbar, Character.valueOf('X'), yr.aX });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     dbpickaxe.bS = ModLoader.addOverride("/gui/items.png", "/items/dbpickaxe.png");
/* 124 */     ModLoader.addName(dbpickaxe, "Death Bar Pickaxe");
/* 125 */     ModLoader.addRecipe(new aan(dbpickaxe, 1), new Object[] { "***", " X ", " X ", Character.valueOf('*'), dbar, Character.valueOf('X'), yr.aX });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     dbaxe.bS = ModLoader.addOverride("/gui/items.png", "/items/dbaxe.png");
/* 133 */     ModLoader.addName(dbaxe, "Death Bar Axe");
/* 134 */     ModLoader.addRecipe(new aan(dbaxe, 1), new Object[] { "** ", "*X ", " X ", Character.valueOf('*'), dbar, Character.valueOf('X'), yr.aX });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     dbshovel.bS = ModLoader.addOverride("/gui/items.png", "/items/dbshovel.png");
/* 142 */     ModLoader.addName(dbshovel, "Death Bar Shovel");
/* 143 */     ModLoader.addRecipe(new aan(dbshovel, 1), new Object[] { " * ", " # ", " # ", Character.valueOf('*'), dbar, Character.valueOf('#'), yr.aX });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     dbhoe.bS = ModLoader.addOverride("/gui/items.png", "/items/dbhoe.png");
/* 151 */     ModLoader.addName(dbhoe, "Death Bar Hoe");
/* 152 */     ModLoader.addRecipe(new aan(dbhoe, 1), new Object[] { "** ", " # ", " # ", Character.valueOf('*'), dbar, Character.valueOf('#'), yr.aX });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     hellishbar.bS = ModLoader.addOverride("/gui/items.png", "/items/hellishbar.png");
/* 162 */     ModLoader.addName(hellishbar, "Hellish Bar");
/* 163 */     ModLoader.addRecipe(new aan(hellishbar, 1), new Object[] { "***", "###", "XXX", Character.valueOf('*'), pb.bA, Character.valueOf('#'), yr.br, Character.valueOf('X'), yr.bw });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     hellishsword.bS = ModLoader.addOverride("/gui/items.png", "/items/hellishsword.png");
/* 171 */     ModLoader.addName(hellishsword, "Hellish Sword");
/* 172 */     ModLoader.addRecipe(new aan(hellishsword, 1), new Object[] { " * ", " * ", " X ", Character.valueOf('*'), hellishbar, Character.valueOf('X'), yr.bo });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     hellishpickaxe.bS = ModLoader.addOverride("/gui/items.png", "/items/hellishpickaxe.png");
/* 180 */     ModLoader.addName(hellishpickaxe, "Hellish Pickaxe");
/* 181 */     ModLoader.addRecipe(new aan(hellishpickaxe, 1), new Object[] { "***", " X ", " X ", Character.valueOf('*'), hellishbar, Character.valueOf('X'), yr.bo });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     hellishaxe.bS = ModLoader.addOverride("/gui/items.png", "/items/hellishaxe.png");
/* 189 */     ModLoader.addName(hellishaxe, "Hellish Axe");
/* 190 */     ModLoader.addRecipe(new aan(hellishaxe, 1), new Object[] { "** ", "*X ", " X ", Character.valueOf('*'), hellishbar, Character.valueOf('X'), yr.bo });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 197 */     hellishshovel.bS = ModLoader.addOverride("/gui/items.png", "/items/hellishshovel.png");
/* 198 */     ModLoader.addName(hellishshovel, "Hellish Shovel");
/* 199 */     ModLoader.addRecipe(new aan(hellishshovel, 1), new Object[] { " * ", " X ", " X ", Character.valueOf('*'), hellishbar, Character.valueOf('X'), yr.bo });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 206 */     hellishhoe.bS = ModLoader.addOverride("/gui/items.png", "/items/hellishhoe.png");
/* 207 */     ModLoader.addName(hellishhoe, "Hellish Hoe");
/* 208 */     ModLoader.addRecipe(new aan(hellishhoe, 1), new Object[] { "** ", " X ", " X ", Character.valueOf('*'), hellishbar, Character.valueOf('X'), yr.bo });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     goldrod.bS = ModLoader.addOverride("/gui/items.png", "/items/goldrod.png");
/* 219 */     ModLoader.addName(goldrod, "Gold Rod");
/* 220 */     ModLoader.addRecipe(new aan(goldrod, 2), new Object[] { "#", "#", Character.valueOf('#'), yr.p });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     ModLoader.registerBlock(heavenlyore);
/* 227 */     heavenlyore.bN = ModLoader.addOverride("/terrain.png", "/items/heavenlyore.png");
/* 228 */     ModLoader.addName(heavenlyore, "Heavenly Ore");
/*     */ 
/*     */     
/* 231 */     heavenlyessence.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlyessence.png");
/* 232 */     ModLoader.addName(heavenlyessence, "Heavenly Essence");
/*     */ 
/*     */     
/* 235 */     heavenbar.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlybar.png");
/* 236 */     ModLoader.addName(heavenbar, "Heavenly Bar");
/* 237 */     ModLoader.addRecipe(new aan(heavenbar, 1), new Object[] { "***", "###", "XXX", Character.valueOf('*'), yr.p, Character.valueOf('#'), yr.n, Character.valueOf('X'), heavenlyessence });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 244 */     heavenlysword.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlysword.png");
/* 245 */     ModLoader.addName(heavenlysword, "Heavenly Sword");
/* 246 */     ModLoader.addRecipe(new aan(heavenlysword, 1), new Object[] { " * ", " * ", " X ", Character.valueOf('*'), heavenbar, Character.valueOf('X'), goldrod });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 253 */     heavenlypickaxe.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlypick.png");
/* 254 */     ModLoader.addName(heavenlypickaxe, "Heavenly Pickaxe");
/* 255 */     ModLoader.addRecipe(new aan(heavenlypickaxe, 1), new Object[] { "***", " X ", " X ", Character.valueOf('*'), heavenbar, Character.valueOf('X'), goldrod });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 262 */     heavenlyaxe.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlyaxe.png");
/* 263 */     ModLoader.addName(heavenlyaxe, "Heavenly Axe");
/* 264 */     ModLoader.addRecipe(new aan(heavenlyaxe, 1), new Object[] { "** ", "*X ", " X ", Character.valueOf('*'), heavenbar, Character.valueOf('X'), goldrod });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     heavenlyshovel.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlyshovel.png");
/* 272 */     ModLoader.addName(heavenlyshovel, "Heavenly Shovel");
/* 273 */     ModLoader.addRecipe(new aan(heavenlyshovel, 1), new Object[] { " * ", " X ", " X ", Character.valueOf('*'), heavenbar, Character.valueOf('X'), goldrod });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 280 */     heavenlyhoe.bS = ModLoader.addOverride("/gui/items.png", "/items/heavenlyhoe.png");
/* 281 */     ModLoader.addName(heavenlyhoe, "Heavenly Hoe");
/* 282 */     ModLoader.addRecipe(new aan(heavenlyhoe, 1), new Object[] { "** ", " X ", " X ", Character.valueOf('*'), heavenbar, Character.valueOf('X'), goldrod });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVersion() {
/* 292 */     return "1.2.5";
/*     */   }
/*     */ }


/* Location:              C:\Users\Reagan\Desktop\godlytooslmod\GodlyToolsMod\!\mod_goldytools.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */