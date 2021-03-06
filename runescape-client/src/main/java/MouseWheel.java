import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("MouseWheel")
public interface MouseWheel {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("useRotation")
	int useRotation();
}
