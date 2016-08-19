package com.translationdata.VideoProject.Service

import com.translationdata.VideoProject.Database.DatabasePrototype
import com.translationdata.VideoProject.Model.AssetContainer

case class ContainerService(database: DatabasePrototype) {
  val container: List[AssetContainer] = database.getContainers
  def printContainers() = {
    for ( show <- container ) {
      println( "==> " + show.toString + "\n" )
    }
  }
}
