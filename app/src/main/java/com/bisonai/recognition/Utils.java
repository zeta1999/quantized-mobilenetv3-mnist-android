/* Copyright 2019 Bisonai Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

package com.bisonai.recognition;

import android.view.View;
import android.widget.LinearLayout;

public class Utils {
    private void changeVisibilityOfAllViews(LinearLayout view, int visibility) {
        for (int i = 0; i < view.getChildCount(); i++) {
            View child = view.getChildAt(i);
            child.setVisibility(visibility);
        }
    }

    public void HideAllViews(LinearLayout view) {
        changeVisibilityOfAllViews(view, View.INVISIBLE);
    }

    public void ShowAllViews(LinearLayout view) {
        changeVisibilityOfAllViews(view, View.VISIBLE);
    }
}
