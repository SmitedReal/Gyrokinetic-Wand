package net.mcreator.basicallygyrokineticwand.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.basicallygyrokineticwand.init.BasicallyGyrokineticWandModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CoreDropProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, double px, double py, double pz) {
		execute(null, world, x, y, z, px, py, pz);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, double px, double py, double pz) {
		double r = 0;
		r = Mth.nextDouble(RandomSource.create(), 0.01, 1);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.CRYING_OBSIDIAN) {
			if (r <= 0.5) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, px, py, pz, new ItemStack(BasicallyGyrokineticWandModItems.LOCATION_CORE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
