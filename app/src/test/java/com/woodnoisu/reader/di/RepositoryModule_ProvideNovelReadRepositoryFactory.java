// Generated by Dagger (https://dagger.dev).
package com.woodnoisu.reader.di;

import com.woodnoisu.ktReader.network.HtmlClient;
import com.woodnoisu.ktReader.persistence.BookDao;
import com.woodnoisu.ktReader.persistence.BookSignDao;
import com.woodnoisu.ktReader.persistence.ChapterDao;
import com.woodnoisu.ktReader.persistence.ReadRecordDao;
import com.woodnoisu.ktReader.repository.NovelReadRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideNovelReadRepositoryFactory implements Factory<NovelReadRepository> {
  private final Provider<HtmlClient> htmlClientProvider;

  private final Provider<BookDao> bookDaoProvider;

  private final Provider<BookSignDao> bookSignDaoProvider;

  private final Provider<ChapterDao> chapterDaoProvider;

  private final Provider<ReadRecordDao> readRecordDaoProvider;

  public RepositoryModule_ProvideNovelReadRepositoryFactory(Provider<HtmlClient> htmlClientProvider,
      Provider<BookDao> bookDaoProvider, Provider<BookSignDao> bookSignDaoProvider,
      Provider<ChapterDao> chapterDaoProvider, Provider<ReadRecordDao> readRecordDaoProvider) {
    this.htmlClientProvider = htmlClientProvider;
    this.bookDaoProvider = bookDaoProvider;
    this.bookSignDaoProvider = bookSignDaoProvider;
    this.chapterDaoProvider = chapterDaoProvider;
    this.readRecordDaoProvider = readRecordDaoProvider;
  }

  @Override
  public NovelReadRepository get() {
    return provideNovelReadRepository(htmlClientProvider.get(), bookDaoProvider.get(), bookSignDaoProvider.get(), chapterDaoProvider.get(), readRecordDaoProvider.get());
  }

  public static RepositoryModule_ProvideNovelReadRepositoryFactory create(
      Provider<HtmlClient> htmlClientProvider, Provider<BookDao> bookDaoProvider,
      Provider<BookSignDao> bookSignDaoProvider, Provider<ChapterDao> chapterDaoProvider,
      Provider<ReadRecordDao> readRecordDaoProvider) {
    return new RepositoryModule_ProvideNovelReadRepositoryFactory(htmlClientProvider, bookDaoProvider, bookSignDaoProvider, chapterDaoProvider, readRecordDaoProvider);
  }

  public static NovelReadRepository provideNovelReadRepository(HtmlClient htmlClient,
      BookDao bookDao, BookSignDao bookSignDao, ChapterDao chapterDao,
      ReadRecordDao readRecordDao) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideNovelReadRepository(htmlClient, bookDao, bookSignDao, chapterDao, readRecordDao));
  }
}
