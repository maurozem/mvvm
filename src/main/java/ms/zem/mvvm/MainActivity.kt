package ms.zem.mvvm

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var botao: Button
    private lateinit var viewModel: NumberListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, ViewModelFactory())
            .get(NumberListViewModel::class.java)
        initView()
        initObservers()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.list)
        recyclerView.layoutManager =
            LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                DividerItemDecoration.VERTICAL
            )
        )
        botao = findViewById(R.id.botao)
        botao.setOnClickListener {
            viewModel.commando(CommandViewModel.OnClick)
        }
    }
    private fun initObservers() {
        viewModel.numberList.observe(this, Observer {
            recyclerView.adapter = ListNumberAdapter(it)
        })
    }
}
