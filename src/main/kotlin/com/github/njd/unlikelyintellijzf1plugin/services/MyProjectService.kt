package com.github.njd.unlikelyintellijzf1plugin.services

import com.intellij.openapi.project.Project
import com.github.njd.unlikelyintellijzf1plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
