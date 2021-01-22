## InfinityViewPagerSampleApp Using ViewPager2 and Glide

### It could be set Auto Paging Timer

#### build.gradle(app)   
```
android {   ...
    repositories {
        flatDir{
            dirs 'libs'
        }
    }
}

dependencies {   ...        
    //viewpager
    implementation "androidx.viewpager2:viewpager2:1.0.0"
    
    //glide
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
    
    //infinity viewpager
    implementation name : 'mj_infinity_viewpager_v.1.0', ext : 'aar'
}
```



#### sample code
```
 private fun init(){
        //make sample example image list
        val sampleImgList = ArrayList<Any>()
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo1)!!)
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo2)!!)
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo3)!!)
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo4)!!)

        //viewpager init (Context, layout, viewpager2, *sampleList)
        //* In sampleList, you can put - java : ArrayList<Object> / - kotlin : ArrayList<Any>  (all types supported by Glide can be used)
        val infinityViewPager = InfinityViewPager(this, R.layout.sample_fragment, main_viewpager, sampleImgList)

        //set viewpager timer
        infinityViewPager.setTimerEnabled(true, 3000, 3000)
    }
```
