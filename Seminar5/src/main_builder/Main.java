package main_builder;

import builder.AutobuzBuild;
import builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzBuild autobuzBuild = new AutobuzBuild();
        autobuzBuild.setNumeSofer("Sofer CTS");
        autobuzBuild.setTextRulat("End Line");
        AutobuzLinie autobuzLinie = autobuzBuild.build();
        System.out.println(autobuzLinie.toString());
    }

}
