//package org.koin.sampleapp.view.weather
//
//import junit.framework.Assert
//import org.junit.Before
//import org.junit.Test
//import org.koin.sampleapp.di.RemoteDataSourceModule
//import org.koin.sampleapp.di.RxTestModule
//import org.koin.sampleapp.di.testRemoteDatasource
//import org.koin.sampleapp.util.any
//import org.koin.standalone.bindProperty
//import org.koin.standalone.inject
//import org.koin.standalone.startContext
//import org.koin.test.KoinTest
//import org.mockito.Mock
//import org.mockito.Mockito
//import org.mockito.MockitoAnnotations
//
//class WeatherPresenterTest : KoinTest {
//
//    val presenter by inject<WeatherResultContract.Presenter>()
//    @Mock lateinit var view: WeatherResultContract.View
//
//    @Before
//    fun before() {
//        MockitoAnnotations.initMocks(this)
//        startContext(testRemoteDatasource())
//
//        // inject server property
//        bindProperty(RemoteDataSourceModule.SERVER_URL, RxTestModule.SERVER_URL)
//
//        presenter.view = view
//    }
//
//    @Test
//    fun testDisplayWeather() {
//        Assert.assertNotNull(presenter)
//
//        val locationString = "Paris, france"
//        presenter.getWeather(locationString)
//
//        Mockito.verify(view).displayWeather(any(), any())
//    }
//
//}