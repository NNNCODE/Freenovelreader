# reader
Free Novel Reading App

Description

Reference Item

1.Pokedex single project mvvm, flow [Pokedex](https://github.com/skydoves/Pokedex)

2.NovelReader Improved book chasing app based on “RenReader” [NovelReader](https://github.com/newbiechen1024/NovelReader)

3.FreeNovel kotlin-based free Android novel app [FreeNovel](https://github.com/lxygithub/FreeNovel)

4.OKBook kotlin + protocols + MVVM pattern to write the novel APP [OKBook](https://gitee.com/xcode_xiao/OKBook)




# Application Profile

Novel reader (modular development / monolithic project development, based on Kotlin + MVVM + Kodein/Coroutines + Hilt + Retrofit + Jsoup + Moshi + Coil + Room + Mockk + Flow + Jetpack and other architectural implementations), coding optimization in kotlin, code logic that Reduce memory usage.

Currently there are features:

1.book city

* Support book city switching (currently support, full-text reading network, Penjing).
* Support novel classification switching.
* Support to view the novel introduction.
* Support direct online reading

2. Bookshelf

    * Support unsubscribe
    * Support subscribing local books (currently only support .txt)
    * Support local reading

3. Individual configuration




4. Reading

* Table of contents (catalog of novels)
* Brightness (set reader brightness, day/night mode)
* Cache (download novels to local)
* Settings (font, font size, page turn mode, background image)

Features that are ready to be added but not currently available:

	1. Hidden bookstore
	2. Try to support thick ink source
	3. Bookstore is no longer written in a dead way, but similar to the installation of thick ink.
	4. Support voice reading

# Possible compilation problems encountered


In the single project version there are many extra folders (buildSrc folder, feature series folder, library series folder, all kinds of build folders), delete them and compile again!

# The following are framework-related

# Project characteristics

	* Small applications based on modern Android application technology stack and MVVM architecture.
	* The project focuses on the implementation of the new library Hilt for dependency injection.
	* Can also fetch data from the network and integrate persistent data into the database through the repository schema

# Technology stack

   	• Development Fundamentals:


Kotlin development language
Support for Android 5.0 (SDK 21) and above devices
Coroutines + Flow to handle asynchronous tasks


Jetpack core components:


LiveData: Real-time data updates
Lifecycle: Managing the lifecycle
ViewModel: Managing UI data
Room: Database operations


Network and Data Handling:


Retrofit + OkHttp: network requests
Moshi: JSON parsing
Coil: image loading


UI related:


Material Components: beautiful interface components
Custom Views: Implementing special effects (e.g. page flip animations)


Architecture:


MVVM: code layering architecture
Hilt: Dependency Injection

# Architecture

Based on MVVM architecture and repository patterns
