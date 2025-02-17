/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mrx7014.s25ultraspoofer;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("s25ultraspoofer: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "Samsung");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "Samsung");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "pa3qksx");

        // ro.product.system.device
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.DEVICE", "pa3qksx");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "pa3qksx");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "pa3qksx");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "pa3qksx");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "pa3qksx");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "pa3qksx");

        // ro.product.system.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.NAME", "pa3qksx");

        // ro.product.vendor.name
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.NAME", "pa3qksx");

        // ro.product.system_ext.name
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.NAME", "pa3qksx");

        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "pa3qksx");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "pa3qksx");

        // ro.product.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "pa3qksx");

        // ro.product.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "pa3qksx");

        // ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "pa3qksx-user");

        // ro.soc.model
        XposedHelpers.setStaticObjectField(Build.class, "SOC.MODEL", "SM8750-3-AB");
        
        // ro.gpu.model
        XposedHelpers.setStaticObjectField(Build.class, "GPU.MODEL", "Adreno830");
        
        // ro.product.board
        XposedHelpers.setStaticObjectField(Build.class, "BOARD", "pa3qksx");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "AP3A.240905.015.A2");

        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "samsung/pa3qksx/pa3qksx:15/AP3A.240905.015.A2/S938NKSU1AYB3:user/release-keys");
    }
}
