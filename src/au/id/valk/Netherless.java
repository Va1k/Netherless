package au.id.valk;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Material;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.block.Block;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: Andreas
 * Date: 29/03/13
 * Time: 11:45 PM
 */
public final class Netherless extends JavaPlugin {

    private final Logger log = Logger.getLogger("Minecraft.Nethrar");

    public Netherless() { }

    @EventHandler
    public void onVehicleMove(VehicleMoveEvent event) {
        Block b;
        Vehicle vehicle = event.getVehicle();

        b = vehicle.getLocation().getBlock();

        if (b.getType().equals(Material.PORTAL)) {
            //A portal!
            vehicle.remove();
        }
    }

}
