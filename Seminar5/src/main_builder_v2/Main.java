package main_builder_v2;

import builder_v2.AutobuzLinie;
import builder_v2.AutobuzBuild;

public class Main {
    public static void main(String[] args) {
        AutobuzBuild autobuzBuild = new AutobuzBuild();
        autobuzBuild.setAreOprire(false).setNrLinie(25);

        AutobuzLinie autobuz = autobuzBuild.build();
        System.out.println(autobuz.toString());
    }
}
