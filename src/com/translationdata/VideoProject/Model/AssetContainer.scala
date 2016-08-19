package com.translationdata.VideoProject.Model

case class AssetContainer(id: String,
                          assetType: String,
                          description: String,
                          ad: List[Ad],
                          video: List[Video],
                          image: List[Image]) {
  def toString2 = {
    s"Show [Id: $id, Asset Type: $assetType, Description: $description]\n" +
      s"\tAd $ad\n" +
      s"\tVideo $video\n" +
      s"\tImage $image\n"
  }

  override def toString = {
    s"Show [Id: $id, Asset Type: $assetType, Description: $description]\n" +
      "\nShow Assets:\n" +
      s"${ad.mkString("\n")}\n\n" +
      s"${video.mkString("\n")}\n\n" +
      s"${image.mkString("\n")}"
  }
}
