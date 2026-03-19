package gg.drak.completelyempty.generator;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class EmptyGenerator extends ChunkGenerator {
    @Override
    public void generateNoise(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkData chunkData) {
        // Intentionally left empty to generate no noise (void world)
    }

    @Override
    public void generateCaves(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkData chunkData) {
        // Intentionally left empty to generate no caves
    }

    @Override
    public void generateBedrock(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkData chunkData) {
        // Intentionally left empty to generate no bedrock
    }

    @Override
    public void generateSurface(@NotNull WorldInfo worldInfo, @NotNull Random random, int chunkX, int chunkZ, @NotNull ChunkData chunkData) {
        // Intentionally left empty to generate no surface
    }

    @Override
    public boolean shouldGenerateCaves() {
        return false; // Disable cave generation
    }

    @Override
    public boolean shouldGenerateDecorations() {
        return false; // Disable decorations like trees or grass
    }

    @Override
    public boolean shouldGenerateMobs() {
        return false; // Disable mob spawning
    }

    @Override
    public boolean shouldGenerateStructures() {
        return false; // Disable structures like villages
    }

    @Override
    public boolean canSpawn(@NotNull World world, int x, int z) {
        return true; // Allow spawning anywhere in the void
    }
}