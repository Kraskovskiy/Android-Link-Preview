package com.leocardz.link.preview.library;

import android.support.v7.widget.RecyclerView;

/**
 * Callback that is invoked with before and after the loading of a link preview
 * 
 */
public interface LinkPreviewCallback {

	void onPre();

	/**
	 * 
	 * @param sourceContent
	 *            Class with all contents from preview.
	 * @param isNull
	 *            Indicates if the content is null.
	 */
	void onPos(SourceContent sourceContent, boolean isNull);

	/**
	 *
	 * @param sourceContent
	 *            Class with all contents from preview.
	 * @param isNull
	 *            Indicates if the content is null.
	 * @param holder
	 *            holder.
	 *
	 */
	void onPos(SourceContent sourceContent, RecyclerView.ViewHolder holder, boolean isNull);
}
