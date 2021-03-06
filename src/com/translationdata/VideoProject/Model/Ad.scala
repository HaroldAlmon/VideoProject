package com.translationdata.VideoProject.Model

import java.net.URL

case class Ad(id: String, name: String, assetType: String, Url: URL, productDescription: String) extends Asset(id, name, assetType, Url) {
  override def toString = s"Ad\n\t${super.toString},\n\tProduct Description: $productDescription"
}
