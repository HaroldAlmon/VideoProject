package com.translationdata.VideoProject.Model

import java.net.URL
case class Image(id: String, name: String, assetType: String, Url: URL) extends Asset(id, name, assetType, Url) {
override def toString = s"Image\n\t${super.toString}"
}