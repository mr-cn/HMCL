/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2019  huangyuhui <huanghongxun2008@126.com> and contributors
 *
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
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl;

import java.nio.file.Path;

import org.jackhuang.hmcl.util.io.JarUtils;
import org.jackhuang.hmcl.util.platform.OperatingSystem;

/**
 * Stores metadata about this application.
 */
public final class Metadata {
    private Metadata() {}

    public static final String VERSION = System.getProperty("hmcl.version.override", JarUtils.thisJar().flatMap(JarUtils::getImplementationVersion).orElse("@develop@"));
    public static final String NAME = "MRMC";
    public static final String TITLE = NAME + " " + VERSION;
    
    public static final String UPDATE_URL = System.getProperty("hmcl.update_source.override", "https://mc.mr-cn.net/hmclupdate.json");
    public static final String CONTACT_URL = "https://hmcl.huangyuhui.net/contact";
    public static final String HELP_URL = "https://hmcl.huangyuhui.net/help";
    public static final String CHANGELOG_URL = "https://hmcl.huangyuhui.net/changelog/";
    public static final String PUBLISH_URL = "http://www.mcbbs.net/thread-142335-1-1.html";
    public static final String MRMC_URL = "https://mc.mr-cn.net/";
    public static final String MRMC_AUTH_URL = "https://mc.mr-cn.net/";

    public static final Path MINECRAFT_DIRECTORY = OperatingSystem.getWorkingDirectory("minecraft");
    public static final Path HMCL_DIRECTORY = OperatingSystem.getWorkingDirectory("hmcl");
}
