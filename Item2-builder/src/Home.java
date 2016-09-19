/**
 * Created by Filip on 2016-09-19.
 */
public class Home {
    private final int walls;
    private final boolean roof;
    private final int windows;
    private final int doors;
    private final boolean chimney;

    public static class Builder {

        private final int walls;
        private final boolean roof;
        private int windows = 0;
        private int doors = 0;
        private boolean chimney = false;

        public Builder(int walls, boolean roof) {
            this.walls = walls;
            this.roof = roof;
        }

        public Builder windows(int val) {
            windows = val;
            return this;
        }

        public Builder doors(int val) {
            doors = val;
            return this;
        }

        public Builder chimney(boolean val) {
            chimney = val;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }

    private Home(Builder builder) {
        walls = builder.walls;
        roof = builder.roof;
        windows = builder.windows;
        doors = builder.doors;
        chimney = builder.chimney;
    }

    @Override
    public String toString() {
        return "Home{" +
                "walls=" + walls +
                ", roof=" + roof +
                ", windows=" + windows +
                ", doors=" + doors +
                ", chimney=" + chimney +
                '}';
    }
}
