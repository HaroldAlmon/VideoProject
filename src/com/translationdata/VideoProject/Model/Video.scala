package com.translationdata.VideoProject.Model

import java.net.URL

case class Video(id: String, name:String, assetType: String, Url: URL, videoType: String) extends Asset(id, name, assetType, Url) {
  override def toString = s"Video[${super.toString}, Video Type: $videoType]"
}
