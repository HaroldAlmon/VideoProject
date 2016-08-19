package com.translationdata.VideoProject.Main

import com.translationdata.VideoProject.Database.DatabasePrototype
import com.translationdata.VideoProject.Service.ContainerService

object Main {
  def main(args: Array[String]): Unit = {
    val containerService: ContainerService = new ContainerService(new DatabasePrototype)
    containerService.printContainers()
  }
}
