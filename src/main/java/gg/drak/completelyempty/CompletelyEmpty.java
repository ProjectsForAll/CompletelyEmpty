package gg.drak.completelyempty;

import gg.drak.completelyempty.generator.EmptyGenerator;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

@Getter @Setter
public final class CompletelyEmpty extends JavaPlugin {
    @Getter @Setter
    private static CompletelyEmpty instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new EmptyGenerator();
    }
}
