/*
 * Copyright 2016 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.mvvmlifecycledemo.ui.taskaddedit;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import me.henrytao.mvvmlifecycledemo.R;
import me.henrytao.mvvmlifecycledemo.ui.base.BaseActivity;

/**
 * Created by henrytao on 4/2/16.
 */
public class TaskAddEditActivity extends BaseActivity {

  public static Intent newIntent(Context context) {
    Intent intent = new Intent(context, TaskAddEditActivity.class);
    return intent;
  }

  private TaskAddEditViewModel mViewModel;

  @Override
  public void onInitializeViewModels() {
    mViewModel = new TaskAddEditViewModel();
    addViewModel(mViewModel);
  }

  @Override
  public void onSetContentView(Bundle savedInstanceState) {
    DataBindingUtil.setContentView(this, R.layout.task_add_edit_activity);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //setSupportActionBar(vToolbar);
    //vToolbar.setNavigationOnClickListener(v -> onBackPressed());
    //ResourceUtils.supportDrawableTint(this, vToolbar, ResourceUtils.Palette.PRIMARY);
  }
}
