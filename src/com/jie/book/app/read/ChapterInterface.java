package com.jie.book.app.read;

import com.bond.bookcatch.vo.BookChapter;

public interface ChapterInterface {
	public void getBookChapter(BookChapter chapter);

	public void onError();

	public void onLast();

	public void onFrist();
}
