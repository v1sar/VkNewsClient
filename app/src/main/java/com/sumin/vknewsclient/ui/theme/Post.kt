package com.sumin.vknewsclient.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sumin.vknewsclient.R

@Preview
@Composable
fun Post() {
    Card(border = BorderStroke(1.dp, Color.Gray)) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.post_comunity_thumbnail),
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text("уволено")
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("14:00")
                }
                Icon(
                    imageVector = Icons.Rounded.MoreVert,
                    modifier = Modifier.size(25.dp),
                    contentDescription = null,
                    tint = Color.Gray
                )
            }
            Text(
                "gaugaijga gagsag asgasgas gasgasga sgasgasg asgasgasg asgsga",
                modifier = Modifier.fillMaxWidth()
            )
            Image(
                painter = painterResource(id = R.drawable.post_content_image),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    Row {
                        Text("206")
                        Image(
                            painter = painterResource(id = R.drawable.ic_views_count),
                            contentDescription = null
                        )
                    }
                }
                Box() {
                    Row {
                        Text("206")
                        Image(
                            painter = painterResource(id = R.drawable.ic_share),
                            contentDescription = null
                        )
                    }
                }
                Box() {
                    Row {
                        Text("11")
                        Image(
                            painter = painterResource(id = R.drawable.ic_comment),
                            contentDescription = null
                        )
                    }
                }
                Box() {
                    Row {
                        Text("491")
                        Image(
                            painter = painterResource(id = R.drawable.ic_like),
                            contentDescription = null
                        )
                    }
                }
            }
        }


    }
}