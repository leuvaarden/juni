package com.github.leuvaarden.juni.services

import com.intellij.openapi.project.Project
import com.github.leuvaarden.juni.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
