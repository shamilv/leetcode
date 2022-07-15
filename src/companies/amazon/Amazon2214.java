package amazon;

public class Amazon2214 {
    public long minimumHealth(int[] damage, int armor) {
        long totalDamage = 0, maxDamage = 0;
        for (int i = 0; i < damage.length; i++) {
            totalDamage += damage[i];
            maxDamage = Math.max(maxDamage, damage[i]);
        }
        return maxDamage == 0 ? 1 : totalDamage - Math.min(maxDamage, armor) + 1;
    }
}
