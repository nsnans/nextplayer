package dev.anilbeesetti.nextplayer.core.data.repository

import android.net.Uri
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import dev.anilbeesetti.nextplayer.core.data.models.VideoState
import dev.anilbeesetti.nextplayer.core.model.Folder
import dev.anilbeesetti.nextplayer.core.model.Video
import kotlinx.coroutines.flow.Flow

interface MediaRepository {
    fun getVideosFlow(): Flow<List<Video>>
    fun getVideosFlowFromFolderPath(folderPath: String): Flow<List<Video>>
    fun getFoldersFlow(): Flow<List<Folder>>
    suspend fun saveVideoState(uri: String, position: Long, audioTrackIndex: Int?, subtitleTrackIndex: Int?, playbackSpeed: Float?, externalSubs: List<Uri>)
    suspend fun getVideoState(uri: String): VideoState?
}
