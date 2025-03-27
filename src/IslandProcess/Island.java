package IslandProcess;

public class Island {
    private final Location[][] locations;

    public Island(int width, int height)
    {
        locations = new Location[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                locations[i][j] = new Location();
            }
        }
    }

    public Location getLocation (int x, int y){
        return locations[x][y];
    }
}
