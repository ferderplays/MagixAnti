package net.ferderplays.MagixAC.util;

import java.util.ArrayList;

public class CheckUtil {

    public void execute() {
        getFolders();
        getApp();
    }

    public String getFolders() {
        ArrayList<String> folders = new ArrayList<String>();
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/Acid"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/earthhack"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/rusherhack"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/phobos"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/Impact"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/kamiblue"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/lambda"));
        folders.add(new String(System.getenv("APPDATA") + "/Roaming/.minecraft/Meteor-Client"));
        for (String folder : folders) {
            String mcfolder = System.getenv("APPDATA") + "/Roaming/.minecraft";
            if (mcfolder.contains(folder)) {
                return "illegal folders found";
            }
        }
        return null;
    }

    public String getApp() {
        String mcapp = ClientBrandRetriver.getClientBrand();
        if (mcapp.toLowerCase().equals("forge")) {
            return "user is using forge";
        } else if (mcapp.toLowerCase().equals("fabric")) {
            return "user is running fabricmc";
        }
        return null;
    }
}
