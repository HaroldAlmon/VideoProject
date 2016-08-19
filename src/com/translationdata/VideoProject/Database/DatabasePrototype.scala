package com.translationdata.VideoProject.Database

import java.net.URL

import com.translationdata.VideoProject.Model.{Image, Ad, Video, AssetContainer}

/**
  * Created by Harold on 7/27/2016.
  */
class DatabasePrototype extends Database{

  private val godzilla = new AssetContainer(
    "show1",
    "Video",
    "Godzilla Movie",
    List( new Ad("aId1", "Ford Ad", "Ad", new URL("http://www.ford.com"),    "New Automobiles"),
          new Ad("aId2", "Verizon Ad", "Ad", new URL("http://www.verizon.com"), "Video Service")),

    List( new Video("vId1", "Godzilla", "Video", new URL("http://www.fox.com/movies/godzilla.mp4"), "Movie") ),

    List( new Image("iId1", "Godzilla Promo", "Image", new URL("http://www.fox.com/movies/GozillaPromo.jpg") )
    )
  )

  private val spacePatrol = new AssetContainer(
    "show2",
    "Video",
    "Space Patrol",
    List( new Ad("aId1", "Acer Ad", "Ad", new URL("http://www.acer.com"),  "New Computers"),
          new Ad("aId2", "Apple Ad", "Ad", new URL("http://www.apple.com"), "iPhone")),

    List( new Video("vId1", "Space Patrol Ep 1", "Video", new URL("http://www.amazon.com/videos/sp1.mp4"), "Full Epsiode"),
          new Video("vId2", "Space Patrol Ep 2", "Video", new URL("http://www.amazon.com/videos/sp2.mp4"), "Full Epsiode"),
          new Video("vId3", "Space Patrol Ep 3", "Video", new URL("http://www.amazon.com/videos/sp3.mp4"), "Full Epsiode") ),

    List( new Image("iId1", "Space Patrol Promo", "Image", new URL("http://www.amazon.com/movies/SpacePatrolPromo.jpg") )
    )
  )

  def getContainers = {
    List(godzilla, spacePatrol)
  }
}
