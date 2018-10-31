package com.pelingulcinar.sonraneolduapp.data

class DataDTO ( val summary : String,
                val images : List<MediaDTO>,
                val weight : Int,
                val source : SourceDTO,
                val media : List<MediaDTO>,
                val title : String,
                val url : String,
                val content : String,
                val tags : TagDTO,
                val seoLink : String,
                val primaryTag : TagDTO,
                val id : Int,
                val publishedDate : Int,
                val presentationType : String,
                val publishedDateFormatted : String,
                val updatedDateFormatted : String,
                val status : Int

)