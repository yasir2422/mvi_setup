package com.github.yasir2422.mvisetup.services

import com.intellij.openapi.project.Project
import com.github.yasir2422.mvisetup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
