package com.uraneptus.letmorelove.core.tags;

import com.uraneptus.letfishlove.LetFishLoveMod;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> PERCH = TagKey.create(Registry.BLOCK_REGISTRY, LetFishLoveMod.modPrefix("fish_roe/perch"));
    public static final TagKey<Block> LIONFISH = TagKey.create(Registry.BLOCK_REGISTRY, LetFishLoveMod.modPrefix("fish_roe/lionfish"));
    public static final TagKey<Block> PIKE = TagKey.create(Registry.BLOCK_REGISTRY, LetFishLoveMod.modPrefix("fish_roe/pike"));
}
