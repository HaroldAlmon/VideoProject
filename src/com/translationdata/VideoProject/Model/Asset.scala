package com.translationdata.VideoProject.Model

import java.net.URL

abstract class Asset(id: String, name: String, assetType: String, Url: URL) {
  override def toString = {
    s"Id: $id, Name: $name, Asset Type: $assetType, Url: $Url"
  }
}
