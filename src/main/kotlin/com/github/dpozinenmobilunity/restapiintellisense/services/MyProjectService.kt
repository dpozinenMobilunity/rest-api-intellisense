package com.github.dpozinenmobilunity.restapiintellisense.services

import com.intellij.openapi.project.Project
import com.github.dpozinenmobilunity.restapiintellisense.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
