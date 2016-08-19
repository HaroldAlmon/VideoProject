package com.translationdata.VideoProject.Database

import com.translationdata.VideoProject.Model.AssetContainer

trait Database {
  def getContainers: List[AssetContainer]
}
