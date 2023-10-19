package com.yechaoa.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class DependenciesPlugin : Plugin<Project> {

    override fun apply(p0: Project) {
        println(">>>>>>>>  " + this.javaClass.name);
    }
}
