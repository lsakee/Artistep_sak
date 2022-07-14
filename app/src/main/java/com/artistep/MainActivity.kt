package com.artistep

import Guide.suchelin.config.BaseActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.artistep.databinding.ActivityMainBinding
import com.recycleviewtest.ProfileData
import com.recycleviewtest.infinityrecycle

// 무하스크롤뷰 탭 레벨 메뉴
//class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate)
class MainActivity : AppCompatActivity() {
    lateinit var profileAdapter: infinityrecycle
    val datas = mutableListOf<ProfileData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    private fun initRecycler() {
        profileAdapter = infinityrecycle(this)
        val rv_profile=findViewById<RecyclerView>(R.id.rv_profile)
        rv_profile.adapter = profileAdapter


        datas.apply {
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "mary", age = 24))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "mary", age = 24))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "mary", age = 24))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "mary", age = 24))
            add(ProfileData(img = R.drawable.ic_launcher_background, name = "mary", age = 24))

            add(ProfileData(img = androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha, name = "jenny", age = 26))
            add(ProfileData(img = androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha, name = "jhon", age = 27))
            add(ProfileData(img = androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha, name = "ruby", age = 21))
            add(ProfileData(img = androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha, name = "yuna", age = 23))

            profileAdapter.datas = datas
            profileAdapter.notifyDataSetChanged()

        }
    }
}
//}  override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        // 무한 스크롤 뷰 구현 방법 1
//        // 리사이클러뷰 구현 하고 끝에 닿았으면 null 추가후 어댑터 알리기
//        // 데이터 요소들 다시 불르고  null제거 후 adpter 연결
//        // view holder 사용
//        // 뷰페이저 사용 무한 스크롤뷰는 구글에서 하지말아야 할 기능이라고 들음
//        // 리사이클 어댑터 생성 및 구현 자료는 xml파일로 하겠음..
//        // 프로그레스바 사용해야됨
//        // 스크롤 리스너 }
//}